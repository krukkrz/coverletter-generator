import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Generator {
    /** Path to the resulting PDF file. */
    public static final String RESULT = "./documents/hello.pdf";

    /**
     * Creates a PDF file: hello.pdf
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
            throws DocumentException, IOException {
        new Generator().createPdf(RESULT);
    }

    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @throws    DocumentException
     * @throws    IOException
     */
    public void createPdf(String filename)
            throws DocumentException, IOException {
        //create document and cover letter object
        Document document = new Document();
        Creator cl = new Creator();

        //ask for company name, position name and klauzula
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwa firmy: ");
        String companyName = scanner.nextLine();

        System.out.println("Nazwa stanowiska: ");
        String positionName = scanner.nextLine();

        System.out.println("Treść klauzuli: ");
        String klauzula = scanner.nextLine();

        //create text of cover letter
        String text = cl.coverLetter(companyName,positionName,klauzula);

        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(text));
        // step 5
        document.close();
    }
}
