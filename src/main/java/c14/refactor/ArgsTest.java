package c14.refactor;


import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArgsTest extends TestCase {

    public void testCreateWithNoSchemaOrArguments() throws Exception {
        Args args = new Args("", new String[0]);
        assertEquals(0, args.cardinality());
    }

    public void testWithNoSchemaButWithOneArgument() throws Exception {

    }

    public void testWithNoSchemaButWithMultipleArguments() throws Exception {

    }

    public void testNonLetterSchema() throws Exception {

    }

    public void testInvalidArgumentFormat() throws Exception {

    }

    public void testSimpleBooleanPresent() throws Exception {

    }

    public void testSimpleStringPresent() throws Exception {

    }

    public void testMissingStringArgument() throws Exception {

    }

    public void testSpacesInFormat() throws Exception {

    }

    public void testSimpleIntPresent() throws Exception {

    }

    public void testInvalidInteger() throws Exception {

    }

    public void testMissingInteger() throws Exception {

    }

    public void testSimpleDoublePresent() throws Exception {

    }

    public void testInvalidDouble() throws Exception {

    }

    public void testMissingDouble() throws Exception {

    }
}
