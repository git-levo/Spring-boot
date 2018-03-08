# from base image centos
FROM centos
MAINTAINER fengshuangchun<Tab0836@163.com>
#install java
RUN yum -y install java
#inatall app
#ADD <src> <dest> from appUrl to container destUrl
COPY building-0.0.1-SNAPSHOT.jar /usr/project/
#start app
ENTRYPOINT ["java" ,"-jar","/usr/project/building-0.0.1-SNAPSHOT.jar"]