package io.jenkins.plugins.analysis.warnings;

import com.thoughtworks.xstream.XStream;
import edu.hm.hafner.analysis.*;
import io.jenkins.plugins.analysis.core.model.AnalysisResult;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class XmlReportParser extends IssueParser {
    private static final Logger LOGGER = Logger.getLogger(AnalysisResult.class.getName());

    public XmlReportParser() {
        super();
    }

    @Override
    public Report parse(final ReaderFactory readerFactory) throws ParsingException {
        readerFactory.readDocument();
        XStream xstream = new XStream();
        Issue issue = (Issue)xstream.fromXML(readerFactory.readString());

//        XmlFile dataFile = new XmlFile(new File(readerFactory.getFileName()));
//        try {
//            Report report = (Report) dataFile.read();
//            if (LOGGER.isLoggable(Level.FINE)) {
//                LOGGER.log(Level.FINE, "Loaded data file " + dataFile);
//            }
//            return report;
//        } catch (IOException | ClassCastException e) {
//            throw new ParsingException("Invalid file format");
//        }
    }
}
