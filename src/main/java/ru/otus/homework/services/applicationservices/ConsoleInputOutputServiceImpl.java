package ru.otus.homework.services.applicationservices;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleInputOutputServiceImpl implements InputOutputService {
    private final Scanner reader;
    private final PrintStream out;

    public ConsoleInputOutputServiceImpl(InputStream in, PrintStream out) {
        this.out = out;
        reader = new Scanner(in);
    }

    @Override
    public void print(String str) {
        out.println(str);
    }

    @Override
    public String read() {
        return reader.nextLine();
    }
}
