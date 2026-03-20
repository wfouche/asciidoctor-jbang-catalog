///usr/bin/env jbang "$0" "$@" ; exit $?

// The same list of JARs that appear in the asciidoctorj shell script
//DEPS org.asciidoctor:asciidoctorj:3.0.1
//DEPS org.asciidoctor:asciidoctorj-api:3.0.1
//DEPS org.asciidoctor:asciidoctorj-cli:3.0.1
//DEPS org.asciidoctor:asciidoctorj-epub3:2.2.0
//DEPS org.asciidoctor:asciidoctorj-diagram:3.1.0
//DEPS org.asciidoctor:asciidoctorj-diagram-batik:1.17
//DEPS org.asciidoctor:asciidoctorj-diagram-ditaamini:1.0.3
//DEPS org.asciidoctor:asciidoctorj-diagram-plantuml:1.2025.3
//DEPS org.asciidoctor:asciidoctorj-diagram-jsyntrax:1.38.2
//DEPS org.asciidoctor:asciidoctorj-pdf:2.3.23
//DEPS org.asciidoctor:asciidoctorj-revealjs:5.2.0

// Exclude these JARs, JBang will load them automatically
// --DEPS com.beust:jcommander:2.0
// --DEPS org.jruby:jruby-complete:9.4.14.0

//JAVA 11+

import java.io.IOException;
import org.asciidoctor.cli.jruby.AsciidoctorInvoker;

public class asciidoctorj {
    public static void main(String[] args) throws IOException {
        AsciidoctorInvoker.main(args);
    }
}
