package io.jenkins.plugins.analysis.warnings;

import javax.annotation.Nonnull;

import org.kohsuke.stapler.DataBoundConstructor;
import org.jenkinsci.Symbol;
import hudson.Extension;

import io.jenkins.plugins.analysis.core.model.ReportScanningTool;

/**
 * Provides a parser and customized messages for Custom XML reports
 *
 * @author Derrick Gibelyou
 */
public class XmlReport extends ReportScanningTool {

    static final String ID = "xml-generic-report";

    /** Creates a new instance of {@link XmlReport}. */
    @DataBoundConstructor
    public XmlReport() {
        super();
        // empty constructor required for stapler
    }

    @Override
    public XmlReportParser createParser() {
        return new XmlReportParser();
    }

    /** Descriptor for this static analysis tool. */
    @Symbol("xmlReport")
    @Extension
    public static class Descriptor extends ReportScanningToolDescriptor {
        /** Creates the descriptor instance. */
        public Descriptor() {
            super(ID);
        }

        @Nonnull
        @Override
        public String getDisplayName() {
            return Messages.Warnings_XmlReport();
        }

        @Override
        public boolean canScanConsoleLog() {
            return false;
        }
    }
}
