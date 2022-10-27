package onboarding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

class Problem1 {

    public boolean checkOutOfRangeException(List<Integer> list) {
        return (list.get(0) > 1) && (list.get(1) < 400);
    }

   public boolean checkPageNumberValidityException(List<Integer> list) {
       return (list.get(0) % 2 == 1) && (list.get(1) - list.get(0) == 1);
   }

    public boolean checkException(List<Integer> list) {
        return checkOutOfRangeException(list) && checkPageNumberValidityException(list);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    public List<Integer> addEachDigitOfPageNumber(List<Integer> list) {
        int summation;
        List<Integer> summationList = new ArrayList<>();
        for (Integer integer : list) {
            summation = 0;
            while (integer > 0) {
                summation += integer % 10;
                integer /= 10;
            }
            summationList.add(summation);
        }
        return summationList;
    }

    public List<Integer> multiplyEachDigitOfPageNumber(List<Integer> list) {
        int multiplication;
        List<Integer> multiplicationList = new ArrayList<>();
        for (Integer integer : list) {
            multiplication = 1;
            while (integer > 0){
                multiplication *= integer % 10;
                integer /= 10;
            }
            multiplicationList.add(multiplication);
        }
        return multiplicationList;
    }

    public List<Integer> calculateEachDigitOfPageNumber(List<Integer> list) {
        List<Integer> calculationList = addEachDigitOfPageNumber(list);
        calculationList.addAll(multiplyEachDigitOfPageNumber(list));
        return calculationList;
    }

    public int getMaxValue(List<Integer> list) {
        int maxValue = list.stream()
                .max(Integer::compare)
                .orElseThrow(NoSuchElementException::new);
        return maxValue;
    }

    public int findWinner(List<Integer> maxValueOfPlayers) {
        int pobiMaxValue = maxValueOfPlayers.get(0);
        int crongMaxValue = maxValueOfPlayers.get(1);

        if (pobiMaxValue > crongMaxValue) {
            return 1;
        } else if (pobiMaxValue < crongMaxValue) {
            return 2;
        }
        return 0;
    }
}