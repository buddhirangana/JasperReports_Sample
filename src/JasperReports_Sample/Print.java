/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JasperReports_Sample;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Buddhi Rangana
 */
public class Print {

    public void PrintWithPreview() {
        String ReportFilePath = "E:\\Project\\GitHub\\JasperReports_Sample\\student.jrxml";
        try {
            JasperReport jr = JasperCompileManager.compileReport(ReportFilePath);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, databaseConnection.getConnection());
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void PrintWithoutPreview() {
        String ReportFilePath = "E:\\Project\\GitHub\\JasperReports_Sample\\student.jrxml";
        try {
            JasperReport jr = JasperCompileManager.compileReport(ReportFilePath);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, databaseConnection.getConnection());
            JasperManager.printReport(jasperPrint, false);
        } catch (Exception e) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
