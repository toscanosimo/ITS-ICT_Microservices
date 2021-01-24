package org.example.book.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Book {

        @Id
        private Long bookId;
        private String title;
        private String author;
        private String genre;
        private int year;

        public Long getBookId() {
                return bookId;
        }

        public String getTitle() {
                return title;
        }

        public String getAuthor() {
                return author;
        }

        public String getGenre() {
                return genre;
        }

        public int getYear() {
                return year;
        }

        public void setBookId(Long bookId) {
                this.bookId = bookId;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        public void setYear(int year) {
                this.year = year;
        }

}
