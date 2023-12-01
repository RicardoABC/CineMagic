-- Movies table
INSERT INTO movies (name, genre, classification, duration) VALUES ("FNAF", "Terror", "PG15", 128)

-- RatingsReviews table
INSERT INTO ratingsreviews (customername, movieid, ratin, review) VALUES ("Edgar", 0, 5, "Excelente adaptacion")

-- Billboard table
INSERT INTO billboard (movieid, language, movieschedule) VALUES (0, "Esp", "Monday 13:00")

-- Transactions table
INSERT INTO transactions (customername, billboardid, seat, paymentdetails) VALUES ("Edgar", 0, "B12", "Efectivo")