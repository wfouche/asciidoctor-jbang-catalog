jbang export maven asciidoctorj.java
pushd asciidoctorj
./mvnw versions:display-dependency-updates
popd
rm -f -r asciidoctorj
