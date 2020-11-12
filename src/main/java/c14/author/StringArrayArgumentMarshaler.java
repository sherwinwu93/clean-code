package c14.author;

import java.util.ListIterator;
import java.util.NoSuchElementException;

import static c14.author.ErrorCode.INVALID_ARGUMENT_FORMAT;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArrayValue;

    @Override
    public void set(ListIterator<String> currentArgument) throws ArgsException {
        try {
            String parameter = currentArgument.next();
            stringArrayValue = parameter.split(",");
        } catch (NoSuchElementException e) {
            throw new ArgsException(INVALID_ARGUMENT_FORMAT);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArrayArgumentMarshaler)
            return ((StringArrayArgumentMarshaler) am).stringArrayValue;
        return new String[]{};
    }
}
