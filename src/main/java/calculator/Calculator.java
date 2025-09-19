package calculator;

public interface Calculator {

    // 마지막 연산 결과 가져오기
    double getRecord();

    // 연산 결과 저장
    void setRecord(double recordValue);

    // 기록 삭제
    void removeResult();
}
