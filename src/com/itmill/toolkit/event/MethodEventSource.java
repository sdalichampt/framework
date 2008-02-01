/* 
@ITMillApache2LicenseForJavaFiles@
 */

package com.itmill.toolkit.event;

import java.lang.reflect.Method;

/**
 * <p>
 * Interface for classes supporting registration of methods as event receivers.
 * </p>
 * 
 * <p>
 * For more information on the inheritable event mechanism see the
 * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
 * </p>
 * 
 * @author IT Mill Ltd.
 * @version
 * @VERSION@
 * @since 3.0
 */
public interface MethodEventSource {

    /**
     * <p>
     * Registers a new event listener with the specified activation method to
     * listen events generated by this component. If the activation method does
     * not have any arguments the event object will not be passed to it when
     * it's called.
     * </p>
     * 
     * <p>
     * For more information on the inheritable event mechanism see the
     * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
     * </p>
     * 
     * @param eventType
     *                the type of the listened event. Events of this type or its
     *                subclasses activate the listener.
     * @param object
     *                the object instance who owns the activation method.
     * @param method
     *                the activation method.
     * @throws java.lang.IllegalArgumentException
     *                 unless <code>method</code> has exactly one match in
     *                 <code>object</code>
     */
    public void addListener(Class eventType, Object object, Method method);

    /**
     * <p>
     * Registers a new listener with the specified activation method to listen
     * events generated by this component. If the activation method does not
     * have any arguments the event object will not be passed to it when it's
     * called.
     * </p>
     * 
     * <p>
     * This version of <code>addListener</code> gets the name of the
     * activation method as a parameter. The actual method is reflected from
     * <code>object</code>, and unless exactly one match is found,
     * <code>java.lang.IllegalArgumentException</code> is thrown.
     * </p>
     * 
     * <p>
     * For more information on the inheritable event mechanism see the
     * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
     * </p>
     * 
     * @param eventType
     *                the type of the listened event. Events of this type or its
     *                subclasses activate the listener.
     * @param object
     *                the object instance who owns the activation method.
     * @param methodName
     *                the name of the activation method.
     * @throws java.lang.IllegalArgumentException
     *                 unless <code>method</code> has exactly one match in
     *                 <code>object</code>
     */
    public void addListener(Class eventType, Object object, String methodName);

    /**
     * Removes all registered listeners matching the given parameters. Since
     * this method receives the event type and the listener object as
     * parameters, it will unregister all <code>object</code>'s methods that
     * are registered to listen to events of type <code>eventType</code>
     * generated by this component.
     * 
     * <p>
     * For more information on the inheritable event mechanism see the
     * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
     * </p>
     * 
     * @param eventType
     *                the exact event type the <code>object</code> listens to.
     * @param target
     *                the target object that has registered to listen to events
     *                of type <code>eventType</code> with one or more methods.
     */
    public void removeListener(Class eventType, Object target);

    /**
     * Removes one registered listener method. The given method owned by the
     * given object will no longer be called when the specified events are
     * generated by this component.
     * 
     * <p>
     * For more information on the inheritable event mechanism see the
     * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
     * </p>
     * 
     * @param eventType
     *                the exact event type the <code>object</code> listens to.
     * @param target
     *                the target object that has registered to listen to events
     *                of type eventType with one or more methods.
     * @param method
     *                the method owned by the target that's registered to listen
     *                to events of type eventType.
     */
    public void removeListener(Class eventType, Object target, Method method);

    /**
     * <p>
     * Removes one registered listener method. The given method owned by the
     * given object will no longer be called when the specified events are
     * generated by this component.
     * </p>
     * 
     * <p>
     * This version of <code>removeListener</code> gets the name of the
     * activation method as a parameter. The actual method is reflected from the
     * target, and unless exactly one match is found,
     * <code>java.lang.IllegalArgumentException</code> is thrown.
     * </p>
     * 
     * <p>
     * For more information on the inheritable event mechanism see the
     * {@link com.itmill.toolkit.event com.itmill.toolkit.event package documentation}.
     * </p>
     * 
     * @param eventType
     *                the exact event type the <code>object</code> listens to.
     * @param target
     *                the target object that has registered to listen to events
     *                of type <code>eventType</code> with one or more methods.
     * @param methodName
     *                the name of the method owned by <code>target</code>
     *                that's registered to listen to events of type
     *                <code>eventType</code>.
     */
    public void removeListener(Class eventType, Object target, String methodName);
}
