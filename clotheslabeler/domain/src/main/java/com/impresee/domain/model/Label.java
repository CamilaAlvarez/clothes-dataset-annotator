package com.impresee.domain.model;

/**
 * Created by calvarez on 04-01-18.
 */

public class Label {
    private BoundingBox boundingBox;
    private Category category;
    private int labelId;

    public Label(BoundingBox boundingBox, Category category, int labelId){
        this.boundingBox = boundingBox;
        this.category = category;
        this.labelId = labelId;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public Category getCategory() {
        return category;
    }

    public int getLabelId() {
        return labelId;
    }

    public void changeCategory(Category newCategory){
        this.category = newCategory;
    }

    public class BoundingBox {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public BoundingBox(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public int getX1() {
            return x1;
        }

        public int getY1() {
            return y1;
        }

        public int getX2() {
            return x2;
        }

        public int getY2() {
            return y2;
        }
    }
}
