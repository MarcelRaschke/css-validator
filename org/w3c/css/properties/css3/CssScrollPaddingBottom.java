//
// Author: Yves Lafon <ylafon@w3.org>
//
// (c) COPYRIGHT MIT, ERCIM, Keio, Beihang, 2017.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.css.properties.css3;

import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;

/**
 * @spec https://www.w3.org/TR/2017/CR-css-scroll-snap-1-20170824/#propdef-scroll-padding-bottom
 */
public class CssScrollPaddingBottom extends org.w3c.css.properties.css.CssScrollPaddingBottom {

    /**
     * Create a new CssScrollPaddingBottom
     */
    public CssScrollPaddingBottom() {
        value = initial;
    }

    /**
     * Creates a new CssScrollPaddingBottom
     *
     * @param expression The expression for this property
     * @throws org.w3c.css.util.InvalidParamException
     *          Expressions are incorrect
     */
    public CssScrollPaddingBottom(ApplContext ac, CssExpression expression, boolean check)
            throws InvalidParamException {
        setByUser();

        if (check && expression.getCount() > 1) {
            throw new InvalidParamException("unrecognize", ac);
        }

        value = CssScrollPadding.checkPaddingValue(ac, expression, this);
    }

    public CssScrollPaddingBottom(ApplContext ac, CssExpression expression)
            throws InvalidParamException {
        this(ac, expression, false);
    }

}

