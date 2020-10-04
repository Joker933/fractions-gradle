public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int  cislo1 = getDenominator() * other.getDenominator();
        int  cislo2 = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
        return new Fraction(cislo2, cislo1);
    }

    @Override
    public IFraction minus(IFraction other) {
        int  cislo1 = getDenominator() * other.getDenominator();
        int  cislo2 = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        return new Fraction(cislo2, cislo1);
    }

    @Override
    public IFraction times(IFraction other) {
        int  cislo1 = getNumerator() * other.getNumerator();
        int  cislo2 = getDenominator() * other.getDenominator();
        return new Fraction(cislo1, cislo2);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int  cislo1 = getNumerator() * other.Denominator();
        int  cislo2 = getDenominator() * other.getNumerator();
        return new Fraction(cislo1, cislo2);

    }
    public static Fraction createNormalised(Integer numerator, Integer denominator) {

    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
