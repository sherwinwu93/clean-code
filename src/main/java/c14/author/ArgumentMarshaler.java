package c14.author;

import java.util.ListIterator;

/**
 * 参数容器
 */
public interface ArgumentMarshaler {
    void set(ListIterator<String> currentArgument) throws ArgsException;
}
