package com.demo;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseBand;
import net.sf.jasperreports.engine.base.JRBaseStaticText;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.JRFillBand;
import net.sf.jasperreports.engine.type.PositionTypeEnum;
import net.sf.jasperreports.engine.type.SplitTypeEnum;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.xml.JasperDesignFactory;
import org.xml.sax.Attributes;

import java.io.FileNotFoundException;
import java.util.List;

public class JasperDemo implements JRDataSource {

    @Override
    public boolean next() throws JRException {
        return false;
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
        return null;
    }

    public static void main(String[] args) throws JRException, FileNotFoundException {
        JasperDesign jasperDesign=new JasperDesign();
        jasperDesign.setName("test");
        JRDesignBand jrDesignBand=new JRDesignBand();
        jrDesignBand.setHeight(20);
        JRDesignStaticText jrDesignStaticText=new JRDesignStaticText();
        jrDesignStaticText.setHeight(10);
        jrDesignStaticText.setPositionType(PositionTypeEnum.FIX_RELATIVE_TO_TOP);
        jrDesignStaticText.setText("This is a label in the title band");
        jrDesignBand.addElement(jrDesignStaticText);
        jasperDesign.setTitle(jrDesignBand);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperCompileManager.writeReportToXmlFile(jasperReport,"C:\\Users\\Administrator\\shiyan.jrxml");
//        test();
    }

    private static void test() throws JRException {

        //        JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Administrator\\jasperReport");
//        JRSaver.saveObject(jasperDesign,"C:\\Users\\Administrator\\jasperDesign");
//        String s = JasperCompileManager.compileReportToFile("C:\\Users\\Administrator\\report1.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Administrator\\report1.jrxml");
//        System.out.println(jasperReport);
//        JasperCompileManager.writeReportToXmlFile(jasperReport,"C:\\Users\\Administrator\\shiyan");
//        JREvaluator jrEvaluator = JasperCompileManager.loadEvaluator(jasperReport);
//        JasperCompileManager.writeReportToXmlStream(jasperReport,new FileOutputStream("C:\\Users\\Administrator\\jasperReport"));
//        JasperReport jasperReport1 = JasperCompileManager.compileReport("C:\\Users\\Administrator\\jasperReport");
//        Map<String,Object> map=new HashMap<>();
//        map.put("parameter1","hahh");
//        JasperFillManager.fillReportToFile(jasperReport1,"C:\\Users\\Administrator\\demo",map);
//        JasperExportManager
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map);
//        String s = JasperCompileManager.compileReportToFile("C:\\Users\\Administrator\\report1.jrxml");
//        System.out.println(s);
//        JasperPrint jasperPrint = JasperFillManager.fillReport(s, map);
//        System.out.println(jasperPrint.getPageHeight());
//        System.out.println(jasperPrint.getPageWidth());
//        System.out.println(jasperPrint.getPages().size());
//        boolean b = JasperPrintManager.printReport(jasperPrint, true);
//        JasperPrintManager.printPage(jasperPrint,0,true);
//        JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Administrator\\report1.jrxml");
//        JasperFillManager.fillReportToFile(jasperReport,"C:\\Users\\Administrator\\demo",map);
//        JasperPrintManager.printReport("C:\\Users\\Administrator\\demo",true);
//        JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Administrator\\report1.jrxml");
//        JRSaver.saveObject(jasperReport,"C:\\Users\\Administrator\\saveObject");
//        String s = JasperRunManager.runReportToHtmlFile("C:\\Users\\Administrator\\saveObject", map);
//        System.out.println(s);
//        JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Administrator\\saveObject", map);
//        System.out.println(jasperPrint.getPages().size());
//        JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Administrator\\report1.jasper", map);
//        JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\Administrator\\demo.pdf");
//        JasperExportManager.exportReportToPdfStream(jasperPrint,new FileOutputStream("C:\\Users\\Administrator\\demo1.pdf"));
//        Object loadObject = JRLoader.loadObject(new File("C:\\Users\\Administrator\\saveObject"));
//        System.out.println(loadObject.getClass().getCanonicalName());
//        JasperExportManager.exportReportToPdfFile("");
    }

}
