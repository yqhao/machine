# FROM java:8-alpine
# ## 更新apk源
# RUN apk update
# ## 设置时区
# RUN apk add -U tzdata
# RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
# ## 设置输出格式
# ENV LANG en_US.UTF-8
# ENV LANGUAGE en_US:en
# ENV LC_ALL en_US.UTF-8
#
# COPY ./app.jar /app.jar
# EXPOSE 20000
# ENTRYPOINT exec java $APP_OPTS -jar /app.jar

FROM openjdk:17.0.2
### 更新apk源
#RUN apk update
### 设置时区
#RUN apk add -U tzdata
#RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
# 设定时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

## 设置输出格式
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

COPY ./app.jar /app.jar

EXPOSE 20000
ENTRYPOINT exec java $APP_OPTS -jar /app.jar