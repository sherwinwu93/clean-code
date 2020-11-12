package c14.author;

import java.util.ListIterator;

public interface ArgumentMarshaler {
    void set(ListIterator<String> currentArgument) throws ArgsException;
}
