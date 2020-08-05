package com.example.shopping.app;


import com.google.gson.JsonElement;

import java.util.List;

public class ShopDemo{


    /**
     * record : {"keywords":["小猪佩奇","汪汪队立大功"]}
     * status : 200
     * messages : {"succeed":[""]}
     */

    private JsonElement record;
    private int status;
    private MessagesBean messages;

    public JsonElement getRecord() {
        return record;
    }

    public void setRecord(JsonElement record) {
        this.record = record;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MessagesBean getMessages() {
        return messages;
    }

    public void setMessages(MessagesBean messages) {
        this.messages = messages;
    }

    public static class RecordBean {
        private List<String> keywords;

        public List<String> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }
    }

    public static class MessagesBean {
        private List<String> succeed;

        public List<String> getSucceed() {
            return succeed;
        }

        public void setSucceed(List<String> succeed) {
            this.succeed = succeed;
        }
    }
}

//public class ShopDemo {
//    /**
//     * id : 10
//     * categoryName : 家具家装
//     * parentId : 0
//     */
//
//    private int id;
//    private String categoryName;
//    private int parentId;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public int getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(int parentId) {
//        this.parentId = parentId;
//    }
//}
