 # Creating maven directory under /opt
 mkdir /opt/maven
 cd /opt/maven
 # downloading maven version 3.6.0
 wget http://mirrors.estointernet.in/apache/maven/maven-3/3.6.1/binaries/apache-maven-3.6.1-bin.tar.gz
 tar -xvzf apache-maven-3.6.1-bin.tar.gz
vi ~/.bash_profile
M2_HOME=/opt/maven/apache-maven-3.6.1
M2=$M2_HOME/bin
PAHT=<Existing_PATH>:$M2_HOME:$M2
