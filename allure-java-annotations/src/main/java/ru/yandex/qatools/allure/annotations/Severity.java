package ru.yandex.qatools.allure.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Each test has severity level. You can change test case severity
 * label using this annotation.
 *
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 10.24.13
 *         <p/>
 * @see ru.yandex.qatools.allure.model.SeverityLevel
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Severity {

    SeverityLevel value();

}
