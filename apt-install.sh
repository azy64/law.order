apt update && \
apt install -y default-jre \
 default-jdk \
 maven \
 net-tools iputils-ping \
 && cd /home/law && mvn spring-boot:run
