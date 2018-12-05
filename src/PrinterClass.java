import javafx.print.*;
import javafx.scene.layout.Region;
import javafx.scene.transform.Scale;

public class PrinterClass
    {
    public static void printNode(final Region region) throws NoSuchMethodException
        {
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, 50, 50, 150, 30);
        PrinterAttributes attr = printer.getPrinterAttributes();
        PrinterJob job = PrinterJob.createPrinterJob();
        job.getJobSettings().setPageLayout(pageLayout);

        double scaleX = pageLayout.getPrintableWidth() / region.getBoundsInParent().getWidth();
        double scaleY = scaleX;
        Scale scale = new Scale(scaleX, scaleY);
        region.getTransforms().add(scale);

        if (job != null && job.showPrintDialog(region.getScene().getWindow()))
            {
            boolean success = job.printPage(pageLayout, region);
            if (success)
                {
                System.out.println("PRINTING SUCCESSFUL");
                job.endJob();
                }
            }
        region.getTransforms().remove(scale);
        }
    }
