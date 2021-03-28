package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String fileName, char c) {
        if (c !='0' && c != '1' && c != 'x') {
            throw new IllegalArgumentException("I accept only the chars: 0, 1, x!");
        }
        int result = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            int sum;
            while ((line = reader.readLine()) != null) {
                sum = parseLine(line, c);
                result += sum;
            }
            return result;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    private int parseLine(String line, char ch) {
        int sum = 0;
        if (line.isEmpty()) {
            return 0;
        } else {
            char[] chars = line.toCharArray();
            for (char c : chars) {
                if (c == ch) {
                    sum++;
                }
            }
        }
        return sum;
    }
}

