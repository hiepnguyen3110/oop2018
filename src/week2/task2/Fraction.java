package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    
    public void setNumerator(int num){
        this.numerator = num;
    }
    
    public void setDenominator(int den){
        this.denominator = den;
    }
    
    public int getNumerator(){
        return this.numerator;
    }
    
    public int getDenominator(){
        return this.denominator;
    }
        
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.setNumerator(numerator);
        this.setDenominator(denominator);
        
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction add = new Fraction( 0, 1 );
        int a = this.getDenominator() * other.getDenominator();// mẫu số chung
        int b1 = this.getNumerator() * other.getDenominator();//tử số this nhân mẫu other
        int b2 = this.getDenominator() * other.getNumerator();//mẫu this nhân tử other
        add.setNumerator(b1 + b2); //cộng tử vs tử
        add.setDenominator(a);//mẫu số chung
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sub = new Fraction( 0, 39);
        int a = this.getDenominator() * other.getDenominator();// mẫu số chung
        int b1 = this.getNumerator() * other.getDenominator();//tử số this nhân mẫu other
        int b2 = this.getDenominator() * other.getNumerator();//mẫu this nhân tử other
        sub.setNumerator(b1 - b2); //trừ tử vs tử
        sub.setDenominator(a);//mẫu số chung
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction mul = new Fraction(0, 39);
        int a = this.getNumerator() * other.getNumerator();//tử số this nhân tử other
        int b = this.getDenominator() * other.getDenominator(); // mẫu số nhân mẫu số
        mul.setNumerator(a);
        mul.setDenominator(b);
        return mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction div = new Fraction(0, 39);
        int a = this.getNumerator() * other.getDenominator();//tử số this nhân mẫu other
        int b = this.getDenominator() * other.getNumerator(); // mẫu số nhân tử số
        div.setNumerator(a);
        div.setDenominator(b);
        return div;
    }
    public boolean equals(Object obj){
        Fraction other = (Fraction)obj;
        int a = this.getNumerator() * other.getDenominator();//tử số this nhân mẫu obj
        int b = this.getDenominator() * other.getNumerator();// mẫu số nhân tử số
        if(a == b) return 1;
        else return 0;
    }
}
