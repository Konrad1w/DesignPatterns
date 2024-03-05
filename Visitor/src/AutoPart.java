public interface AutoPart {
    void accept(Visitor v);

    void fabricationCost();

    void fabricationTime();

    void avgUsageTime();

    void yearlyCost();

}
