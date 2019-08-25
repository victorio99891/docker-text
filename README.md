# Mount Docker deamon to jenkins container
docker run -itd -v //var/run/docker.sock:/var/run/docker.sock -v /${pwd}/jenkins_home:/var/jenkins_home -p 9090:8080 -p 50001:50000 -u root --name jenkins jenkins
