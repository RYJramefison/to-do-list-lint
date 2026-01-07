package org.folder.todolistlinter.entity.prototype;

public class Document implements DocumentPrototype {
    private String type;
    private String content;

    public Document(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public Document(Document target) {
        if (target != null) {
            this.type = target.type;
            this.content = target.content;
        }
    }

    @Override
    public DocumentPrototype cloneDocument() {
        return new Document(this);
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public String toString() {
        return "Document [type=" + type + ", content=" + content + "]";
    }
}

