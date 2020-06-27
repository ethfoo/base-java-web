FROM hub.c.163.com/qingzhou/tomcat:7-oracle-jdk-rev4
ENV TZ=Asia/Shanghai LANG=C.UTF-8 LANGUAGE=C.UTF-8 LC_ALL=C.UTF-8
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
WORKDIR /usr/local/tomcat
RUN rm -rf webapps/*
COPY ./target/*.war webapps/
ENTRYPOINT ["catalina.sh", "run"]
