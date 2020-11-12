package c14.author;

import java.util.ListIterator;

import static c14.author.ErrorCode.INVALID_DOUBLE;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    private double doubleValue;

    @Override
    public void set(ListIterator<String> currentArgument) throws ArgsException {
        try {
            String parameter = currentArgument.next();
            doubleValue = Double.parseDouble(parameter);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_DOUBLE);
        }
    }

    public static double getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof DoubleArgumentMarshaler)
            return ((DoubleArgumentMarshaler) am).doubleValue;
        return
                0.0;
    }
}
