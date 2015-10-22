package com.recommendation.RelationHolder;

import com.recommendation.Util.ValueUtil;
import com.recommendation.ValueOperate.StringValueOperator;
import com.recommendation.ValueOperate.ValueOperator;

import java.util.ArrayList;
import java.util.List;

/**
 * User: likang
 * Date: 15/10/21
 * Time: 下午11:20
 */
public class StringRelationHolder extends ValueUtil {

    protected static ValueOperator valueOperator;

    static {
        valueOperator = new StringValueOperator();
    }

    public static boolean hasString(Object object, String text) {

        List<String> result = new ArrayList<>();
        ValueUtil.setValue(object, result, valueOperator);

        for(String str : result){
            if(str.contains(text)){
                return true;
            }
        }

        return false;
    }

}
