package io.github.jinlongliao.patcher2.constant;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author liaojinlong
 * @since 2022-02-17 20:21
 */
public enum LangSupport {
    JAVA("java"),
    GROOVY("groovy"),
    KOTLIN("kt"),
    ;
    /**
     * 后缀
     */
    private final String suffix;

    LangSupport(String suffix) {
        this.suffix = suffix;
    }

    public static final Set<String> SUPPORT_SUFFIX;

    static {
        SUPPORT_SUFFIX = Arrays.stream(LangSupport.values()).map(LangSupport::getSuffix).collect(Collectors.toSet());
    }

    public String getSuffix() {
        return suffix;
    }

    public static boolean supportLang(String suffix){
        return SUPPORT_SUFFIX.contains(String.valueOf(suffix).toLowerCase(Locale.ROOT));
    }
}
