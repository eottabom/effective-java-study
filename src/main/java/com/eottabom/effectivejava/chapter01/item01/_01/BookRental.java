package com.eottabom.effectivejava.chapter01.item01._01;

public class BookRental {

	private boolean isUrgent;

	private boolean isExtended;

	private String bookTitle;

	private RentalStatus status;

	// 시그니쳐가 동일한 경우에는 2개의 생성자를 만들 수 없다.
	// 물론 시그니쳐의 순서를 바꿔서 만들면 Java 컴파일러가 다른것으로 인식하고 생성은 할 수 있지만,
	// 그렇게 유용하지 않다. 왜냐면, 생성자 명은 클래스명으로 만들어야 하므로.
//	public BookRental(String bookTitle, boolean isExtended) {
//		this.bookTitle = bookTitle;
//	}

//	public BookRental(String bookTitle, boolean isUrgent) {
//		this.bookTitle = bookTitle;
//	}

	// 일반 대여
	public static BookRental normalRental(String bookTitle) {
		BookRental rental = new BookRental();
		rental.bookTitle = bookTitle;
		rental.status = RentalStatus.RENTED;
		return rental;
	}

	// 급한 대여
	public static BookRental urgentRental(String bookTitle) {
		BookRental rental = new BookRental();
		rental.isUrgent = true;
		rental.bookTitle = bookTitle;
		rental.status = RentalStatus.RENTED;
		return rental;
	}

	// 연장 대여
	public static BookRental extendedRental(String bookTitle) {
		BookRental rental = new BookRental();
		rental.isExtended = true;
		rental.bookTitle = bookTitle;
		rental.status = RentalStatus.EXTENDED;
		return rental;
	}

	public static void main(String[] args) {
		BookRental rental = BookRental.urgentRental("Effective Java");

		if (rental.status == RentalStatus.RENTED) {
			System.out.println(rental.bookTitle + " 대여가 완료되었습니다.");
		}
	}

}
