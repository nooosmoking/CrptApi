package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Document {
    @JsonProperty("description")
    private Description description;

    @JsonProperty("doc_id")
    private String docId;

    @JsonProperty("doc_status")
    private String docStatus;

    @JsonProperty("doc_type")
    private String docType;

    @JsonProperty("importRequest")
    private boolean importRequest;

    @JsonProperty("owner_inn")
    private String ownerInn;

    @JsonProperty("participant_inn")
    private String participantInn;

    @JsonProperty("producer_inn")
    private String producerInn;

    @JsonProperty("production_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date productionDate;

    @JsonProperty("production_type")
    private String productionType;

    @JsonProperty("products")
    private List<Product> products;

    @JsonProperty("reg_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date regDate;

    @JsonProperty("reg_number")
    private String regNumber;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public boolean isImportRequest() {
        return importRequest;
    }

    public void setImportRequest(boolean importRequest) {
        this.importRequest = importRequest;
    }

    public String getOwnerInn() {
        return ownerInn;
    }

    public void setOwnerInn(String ownerInn) {
        this.ownerInn = ownerInn;
    }

    public String getParticipantInn() {
        return participantInn;
    }

    public void setParticipantInn(String participantInn) {
        this.participantInn = participantInn;
    }

    public String getProducerInn() {
        return producerInn;
    }

    public void setProducerInn(String producerInn) {
        this.producerInn = producerInn;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public static class Description {
        @JsonProperty("participantInn")
        private String participantInn;

        public String getParticipantInn() {
            return participantInn;
        }

        public void setParticipantInn(String participantInn) {
            this.participantInn = participantInn;
        }
    }

    public static class Product {
        @JsonProperty("certificate_document")
        private String certificateDocument;

        @JsonProperty("certificate_document_date")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date certificateDocumentDate;

        @JsonProperty("certificate_document_number")
        private String certificateDocumentNumber;

        @JsonProperty("owner_inn")
        private String ownerInn;

        @JsonProperty("producer_inn")
        private String producerInn;

        @JsonProperty("production_date")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date productionDate;

        @JsonProperty("tnved_code")
        private String tnvedCode;

        @JsonProperty("uit_code")
        private String uitCode;

        @JsonProperty("uitu_code")
        private String uituCode;

        public String getCertificateDocument() {
            return certificateDocument;
        }

        public void setCertificateDocument(String certificateDocument) {
            this.certificateDocument = certificateDocument;
        }

        public Date getCertificateDocumentDate() {
            return certificateDocumentDate;
        }

        public void setCertificateDocumentDate(Date certificateDocumentDate) {
            this.certificateDocumentDate = certificateDocumentDate;
        }

        public String getCertificateDocumentNumber() {
            return certificateDocumentNumber;
        }

        public void setCertificateDocumentNumber(String certificateDocumentNumber) {
            this.certificateDocumentNumber = certificateDocumentNumber;
        }

        public String getOwnerInn() {
            return ownerInn;
        }

        public void setOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
        }

        public String getProducerInn() {
            return producerInn;
        }

        public void setProducerInn(String producerInn) {
            this.producerInn = producerInn;
        }

        public Date getProductionDate() {
            return productionDate;
        }

        public void setProductionDate(Date productionDate) {
            this.productionDate = productionDate;
        }

        public String getTnvedCode() {
            return tnvedCode;
        }

        public void setTnvedCode(String tnvedCode) {
            this.tnvedCode = tnvedCode;
        }

        public String getUitCode() {
            return uitCode;
        }

        public void setUitCode(String uitCode) {
            this.uitCode = uitCode;
        }

        public String getUituCode() {
            return uituCode;
        }

        public void setUituCode(String uituCode) {
            this.uituCode = uituCode;
        }
    }
}
