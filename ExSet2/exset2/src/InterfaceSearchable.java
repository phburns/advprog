interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String url;
    private String htmlContent;
    
    public Document(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
    
    public boolean search(String keyword) {
        return url.toLowerCase().contains(keyword.toLowerCase()) ||
               htmlContent.toLowerCase().contains(keyword.toLowerCase());
    }
}

class WebPage implements Searchable {
    private String url;
    private String htmlContent;
    
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
    
    public boolean search(String keyword) {
        return url.toLowerCase().contains(keyword.toLowerCase()) ||
               htmlContent.toLowerCase().contains(keyword.toLowerCase());
    }
}

public class InterfaceSearchable {
    public static void main(String[] args) {
        Document doc = new Document(
            "https://example.com/doc",
            "<html><body>This is a sample document.</body></html>"
        );
        
        WebPage webpage = new WebPage(
            "https://example.com/java",
            "<html><body>Java programming tutorial</body></html>"
        );
        
        String keyword = "java";
        System.out.println("Searching for: " + keyword);
        System.out.println("Document found: " + doc.search(keyword));
        System.out.println("WebPage found: " + webpage.search(keyword));
    }
}