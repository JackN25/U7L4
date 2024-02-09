import java.util.ArrayList;

public class ArrayListAlgorithms {
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String word: stringList) {
            if (word.contains(target)) {
                return true;
            }
        }
        return false;
    }

    public static int belowAverage(ArrayList<Integer> intList) {
        int average = 0;
        int numsBelowAverage = 0;
        for (int num : intList) {
            average += num;
        }
        average /= intList.size();

        for (int num : intList) {
            if (num < average) {
                numsBelowAverage ++;
            }
        }
        return numsBelowAverage;
    }

    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if ((word.charAt(word.length() - 1) + "").equals("s")) {
                wordList.set(i, word.toUpperCase());
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList) {
        int indexOfMin = 0;
        int minValue = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) < minValue) {
                indexOfMin = i;
                minValue = intList.get(i);
            }
        }
        return indexOfMin;
    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
        for (int i = 0; i < numList1.size(); i++) {
            if (!(numList1.get(i) == numList2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void removeOdds(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 != 0) {
                numList.remove(i);
                i--;
            }
        }
    }

    public static void wackyVowels(ArrayList<String> wordList)
    {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).contains("a") || wordList.get(i).contains("e") || wordList.get(i).contains("i") || wordList.get(i).contains("o")) {
                wordList.remove(i);
                i--;
            } else {
                wordList.add(i, wordList.get(i));
                i++;
            }
        }
    }

    public static void removeDuplicates(ArrayList<Integer> intList) {
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for (int num : intList) {
            if (!tempArray.contains(num)) {
                tempArray.add(num);
            }
        }
        intList.clear();
        intList.addAll(tempArray);
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList)
    {
        for (int i = 1; i < wordList.size(); i++) {
            wordList.add(i, wordList.get(i - 1).toUpperCase());
            i++;
        }
        wordList.add(wordList.get(wordList.size() - 1).toUpperCase());
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        int listOriginalSize = wordList.size();
        for (int i = 0; i < listOriginalSize; i++) {
            wordList.add(wordList.get(i).toUpperCase());
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence)
    {
        String [] parsedList = sentence.split(" ");
        ArrayList<String> parsedAndReversed = new ArrayList<String>();
        for (int i = parsedList.length - 1; i >= 0; i--) {
            parsedAndReversed.add(parsedList[i]);
        }
        return parsedAndReversed;
    }

    public static void moveBWords(ArrayList<String> wordList)
    {
        int shiftedIndex = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf("b") == 0) {
                wordList.add(shiftedIndex, wordList.remove(i));
                shiftedIndex++;
                i--;
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList)
    {
        int maxTimesAppeared = 1;
        for (int num : numList) {
            int timesElementAppeared = 0;
            for (int i = 0; i < numList.length; i++) {
                if (numList[i] == num) {
                    timesElementAppeared++;
                }
            }
            if (timesElementAppeared > maxTimesAppeared) {
                maxTimesAppeared = timesElementAppeared;
            }
        }
        ArrayList<Integer> modeList = new ArrayList<Integer>();
        for (int num : numList) {
            int count = 0;
            for (int n : numList) {
                if (n == num) {
                    count++;
                }
            }
            if (!modeList.contains(num) && count == maxTimesAppeared && count != 1) {
                modeList.add(num);
            }
        }
        return modeList;

    }

}
