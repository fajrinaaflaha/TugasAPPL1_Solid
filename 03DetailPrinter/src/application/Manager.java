/*
 * Created By Fajrina Aflaha.
 */
package application;

import java.util.List;

/**
 *
 * @author Fajrina Aflaha
 */
public class Manager extends Employee{
    private List<String> documents;
    
    public Manager(String name, List<String> documents) {
        super(name);
        this.documents = documents;
    }

    /**
     * @return the documents
     */
    public List<String> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }
    
    @Override
    public String toString(){
        return super.toString() + System.lineSeparator() + 
                String.join(System.lineSeparator(), this.documents);
    }
}
