package c14.refactor;
import c14.refactor.ArgumentMarshaler;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    protected boolean booleanValue = false;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }

    @Override
    public Object get() {
        return booleanValue;
    }
}
