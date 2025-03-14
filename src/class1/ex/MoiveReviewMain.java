package class1.ex;

public class MoiveReviewMain {

    public static void main(String[] args) {
        MoiveReview movie1;
        MoiveReview movie2;

        movie1 = new MoiveReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        movie2 = new MoiveReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MoiveReview[] movies = {movie1, movie2};

        for (int i = 0; i < movies.length; i++) {
            System.out.println("영화 제목: " + movies[i].title + " 리뷰: " + movies[i].review);
        }

        for (MoiveReview movie : movies) {
            System.out.println("영화 제목: " + movie.title + " 리뷰: " + movie.review);
        }
    }
}
