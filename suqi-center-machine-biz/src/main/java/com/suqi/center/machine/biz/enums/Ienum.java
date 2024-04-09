
package com.suqi.center.machine.biz.enums;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.*;

public interface Ienum<T extends Ienum<T>> {
	int value();

	String info();

	T[] enums();

	default T valueOf(int i) {
		for (T t : enums()) {
			if (t.value() == i) {
				return t;
			}
		}
		return null;
	}

	default String infoByValue(int i) {
		for (T t : enums()) {
			if (t.value() == i) {
				return t.info();
			}
		}
		return null;
	}

	default T infoOf(String i) {
		for (T t : enums()) {
			if (t.info().equals(i)) {
				return t;
			}
		}
		return null;
	}

	default Map<Integer, String> toMap() {
		Map<Integer, String> ky = new HashMap<>();
		T[] values = enums();
		for (T t : values) {
			ky.put(t.value(), t.info());
		}
		return ky;
	}

	default Map<String, Integer> toRreversalMap() {
		Map<String, Integer> ky = new HashMap<>();
		T[] values = enums();
		for (T t : values) {
			ky.put(t.info(), t.value());
		}
		return ky;
	}

	@SuppressWarnings("unchecked")
	default public String info(int i) {
		return info(this.getClass(), i);
	}

	@SuppressWarnings("unchecked")
	default public Integer value(String info) {
		return value(this.getClass(), info);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Ienum<T>> String info(Class<T> cls, int i) {
		T[] all;
		try {
			all = (T[]) cls.getDeclaredMethod("values").invoke(null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		if (all != null) {
			for (T t : all) {
				if (t.value() == i) {
					return t.info();
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Ienum<T>> Integer value(Class<T> cls, String info) {
		T[] all;
		try {
			all = (T[]) cls.getDeclaredMethod("values").invoke(null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		if (all != null) {
			for (T t : all) {
				if (t.info().equalsIgnoreCase(info)) {
					return t.value();
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		String keys = "-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：导出旧云机数据中，6：导出就云机数据失败，7：导出旧云机数据成功，8：恢复数据中，9：恢复数据失败，10：恢复成功，11：恢复关系数据失败，12：恢复关系数据成功，13：新云机退出维护模式失败，50：换机完成";
		String result = createFromDataStr("MoveStateEnum", keys);
		System.out.println(result);
	}

	public static String createFromDataStr(String className, String keys) {
		return createFromDataStr(className, keys, false);
	}
	public static String createFromDataStr(String className, String keys, boolean reversal) {
		String s = """
				public enum #{[name]} {
				    
					//@formatter:off
    #{foreach(#list,'	/**
    	 * #{[0]}：#{[1]}
    	 */
    	#{[2]}(#{[0]},"#{[1]}"),
    	
    ')}	
    	;
    	//@formatter:on
					private final int value;
				    
					private final String info;
				    
					#{[name]}(int value, String info) {
						this.value = value;
						this.info = info;
					}
				    
					
					public int value() {
						return value;
					}
				    
					
					public String info() {
						return info;
					}
				    
					public #{[name]}[] enums() {
						return values();
					}
				    
				}
				""";
		RootMap map = new RootMap();
		map.put("name", className);
		List<List<String>> rs = new ArrayList<>();
		map.put("list", rs);
		String[] rows = keys.split(",|，|；");
		for (String r : rows) {
			String[] cls = r.trim().split(":|：|\\|");
			if (cls.length == 2) {
				for (int i = 0; i < cls.length; i++) {
					cls[i] = cls[i].trim();
				}
				if(reversal) {
					String tmp = cls[0];
					cls[0]=cls[1];
					cls[1]=tmp;
				}
				List<String> asList = new ArrayList<>();
				asList.addAll(Arrays.asList(cls));
				String x = cls[1];
				String o = x;
				asList.add(o);
				rs.add(asList);
			}
		}
		String result = (String) spelT(s, map);
		return result;
	}

	public static class RootMap extends HashMap<String, Object> {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public static int random() {
			Random ra = new Random();
			return Math.abs(ra.nextInt());
		}

		private Object $item;

		public Object get$item() {
			return $item;
		}

		public void set$item(Object $item) {
			this.$item = $item;
		}

		public static Object foreach(Collection<?> collection, String template) {
			StringBuilder sb = new StringBuilder();
			if (collection != null) {
				for (Object object : collection) {
					sb.append(spelT(template, object));
				}
			}
			return sb.toString();
		}

		public static Object foreachR(RootMap root, Collection<?> collection, String template) {
			StringBuilder sb = new StringBuilder();
			if (collection != null) {
				for (Object object : collection) {
					root.set$item(object);
					sb.append(spelT(template, root));
				}
			}
			return sb.toString();
		}
	}

	public static Object spelT(String template, Object rootObj) {
		StandardEvaluationContext s = new StandardEvaluationContext(rootObj);
		ExpressionParser parser = new SpelExpressionParser();
		TemplateParserContext context = new TemplateParserContext();
		Expression expr = parser.parseExpression(template, context);
		if (Map.class.isAssignableFrom(rootObj.getClass())) {
			Map<String, Object> map = (Map) rootObj;
			s.setVariables(map);
		}
		Object rs = expr.getValue(s);
		return rs;
	}
}
