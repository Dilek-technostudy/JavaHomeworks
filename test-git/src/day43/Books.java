package day43;

public class Books {


        private String bookName;

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        private int pageNumber;

        public int price() {

            return 40;
        }

    }


class ChildrenBook extends Books{

    public int price() {
        return super.price()-20;
    }

}

class Comics extends Books{

    public int price() {
        return super.  price()-5;
    }
}