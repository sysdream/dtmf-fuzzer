/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/virtualabs/workspace/dtmfuzz/src/com/sysdream/fino/IInspectionService.aidl
 */
package com.sysdream.fino;
/**
 * Aim at providing a full featured remote inspection interface once the
 * implementation service has been injected into an existing package.
 *
 * As part of the project Fino for minimal footprint dynamic inspection, it is
 * expected but not required that injection of the implementation service and
 * inspection are silent unless the user specifically requires a field to be
 * modified or a remote method to be invoked.
 *
 * The inspection mechanism is driven by the entry point concept. An entry
 * is an arbitrary reference to any object in the remote application memory.
 * Memoery is explored in a semantic way by browsing from entry points to
 * object fields. A single reference is described by:
 *  - the entry point that lead to it;
 *  - the path, from field to field, from the entry point to the specific
 *    reference.
 * Both entry points and path items are passed as integer index respectively
 * from the entry point list and the field list.
 *
 * Because encoding arbitrary object to <code>Parcelable</code> strings sounds
 * tough, only <code>String</code> objects are returned. In case of typed
 * returned objects, the <code>String</code> looks like:
 *
 *   "<type>:<value>"
 *
 * @author <a href="mailto:p.jaury@sysdream.com">Pierre Jaury</a>
 * @version 1.0
 */
public interface IInspectionService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.sysdream.fino.IInspectionService
{
private static final java.lang.String DESCRIPTOR = "com.sysdream.fino.IInspectionService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.sysdream.fino.IInspectionService interface,
 * generating a proxy if needed.
 */
public static com.sysdream.fino.IInspectionService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.sysdream.fino.IInspectionService))) {
return ((com.sysdream.fino.IInspectionService)iin);
}
return new com.sysdream.fino.IInspectionService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getEntryPoints:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getEntryPoints();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_filterEntryPoints:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.filterEntryPoints(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getFields:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String[] _result = this.getFields(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getMethods:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String[] _result = this.getMethods(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getClasses:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String[] _result = this.getClasses(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_newInstance:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
int _result = this.newInstance(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPath:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String _result = this.getPath(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String _result = this.getType(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTypes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String[] _result = this.getTypes(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getClass:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getClass(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String _result = this.getValue(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
this.setValue(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getMethodName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
java.lang.String _result = this.getMethodName(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMethodParams:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
int[] _arg3;
_arg3 = data.createIntArray();
java.lang.String[] _result = this.getMethodParams(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_invokeMethod:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
int[] _arg3;
_arg3 = data.createIntArray();
int _result = this.invokeMethod(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_invokeMethodByName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String _arg2;
_arg2 = data.readString();
int[] _arg3;
_arg3 = data.createIntArray();
int _result = this.invokeMethodByName(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isIterable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
boolean _result = this.isIterable(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getIterable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
java.lang.String[] _result = this.getIterable(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getIterableItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
int _result = this.getIterableItem(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_pushString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.pushString(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_pushInt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.pushInt(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_pushBoolean:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.pushBoolean(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_push:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int _result = this.push(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_loadMacro:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.loadMacro(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.sysdream.fino.IInspectionService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * List registered entry points.
     *
     * @return an array listing existing entry points
     */
@Override public java.lang.String[] getEntryPoints() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEntryPoints, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Filter registered entry points given a compatible type description.
     *
     * An registered entry point is compatible with the type described if :
     *  - the given <code>String</code> is a resolvable type name in the
     *    service context;
     *  - the entry point canonical type may be cast to the described type.
     *
     * @param type the type description
     * @return an <code>int[]</code> array of compatible entry points
     */
@Override public int[] filterEntryPoints(java.lang.String type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(type);
mRemote.transact(Stub.TRANSACTION_filterEntryPoints, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * List fields available for the referenced object.
     *
     * The field list is returned in the "<type>:<name>" format.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the list of accessible fields
     */
@Override public java.lang.String[] getFields(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getFields, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * List methods available for the referenced object.
     *
     * The field list is returned in the "<full name>:<name>" format.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the list of accessible methods
     */
@Override public java.lang.String[] getMethods(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getMethods, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * List classes available for the referenced object.
     *
     * The class list is returned in the "<full name>:<name>" format.
     *
     * @param entryPoint the referrence entry point
     * @param path the path from entry point
     * @return the list of accessible classes
     */
@Override public java.lang.String[] getClasses(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getClasses, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Create a new instance of a given type.
     *
     * @param className the target class name
     * @param params parameters to pass to the constructor
     * @return index of the entry point for the new instance
     */
@Override public int newInstance(int entryPoint, int[] path, int[] paramsId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeIntArray(paramsId);
mRemote.transact(Stub.TRANSACTION_newInstance, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Generate a descriptive value of the path from the entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return a dot-separated list of fields as a <code>String</code>
     */
@Override public java.lang.String getPath(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Describe the type of the referenced object.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the described type as a <code>String</code>
     */
@Override public java.lang.String getType(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getType, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Describe the type hierarchy of the referenced object
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the described type hierary as a list of <code>String</code>
     */
@Override public java.lang.String[] getTypes(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getTypes, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Retrieve a Class object corresponding to a class name
     *
     * @param className the class name
     * @return the class as an entrypoint index
     */
@Override public int getClass(java.lang.String className) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(className);
mRemote.transact(Stub.TRANSACTION_getClass, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the <code>String</code> value of the referenced object.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the object description as return by <code>toString()</code>
     */
@Override public java.lang.String getValue(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getValue, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set an object value.
     *
     * Because the object value cannot be modified directly, only its reference
     * according to the given path is set. Thus, not every reference to the
     * object is modified and the behavior may differ depending on the entry
     * point and path used for reference.
     * For the same reason, entry point value cannot be set.
     *
     * @param entryPoint an <code>int</code> value
     * @param path an <code>int</code> value
     * @param value an <code>int</code> value
     */
@Override public void setValue(int entryPoint, int[] path, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setValue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get a method name.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @return the method name
     */
@Override public java.lang.String getMethodName(int entryPoint, int[] path, int method) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeInt(method);
mRemote.transact(Stub.TRANSACTION_getMethodName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get a list of method parameter types.
     *
     * If the parameters list is empty or misformed, then the raw list
     * of parameter types is returned. Otherwise, a typed list of current
     * parameter values is returned.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @param parameters current parameter values
     * @return a list of <code>String</code> description of parameter types
     */
@Override public java.lang.String[] getMethodParams(int entryPoint, int[] path, int method, int[] parameters) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeInt(method);
_data.writeIntArray(parameters);
mRemote.transact(Stub.TRANSACTION_getMethodParams, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Invoke a method given the provided parameters.
     *
     * Parameters must be provided as a list of index from the entry point
     * list. Thus, only entry points may be used as method parameters. The
     * result is returned as an entry point as well. See the <code>push</code>
     * method for creating entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @param parameters the parameter list
     * @return index of the method result in the entry point list
     */
@Override public int invokeMethod(int entryPoint, int[] path, int method, int[] parameters) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeInt(method);
_data.writeIntArray(parameters);
mRemote.transact(Stub.TRANSACTION_invokeMethod, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Invoke a method given the provided parameters.
     *
     * Parameters must be provided as a list of index from the entry point
     * list. Thus, only entry points may be used as method parameters. The
     * result is returned as an entry point as well. See the <code>push</code>
     * method for creating entry point.
     *
     * @param entryPoint the reference entry point
     * @param method the method name to invoke
     * @param parameters the parameter list
     * @return index of the method result in the entry point list
     */
@Override public int invokeMethodByName(int entryPoint, int[] path, java.lang.String method, int[] parameters) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeString(method);
_data.writeIntArray(parameters);
mRemote.transact(Stub.TRANSACTION_invokeMethodByName, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if the referenced object is iterable.
     *
     * Both standard Java arrays and objects implementing the
     * <code>Iterable</code> interface are considered iterable.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return <code>true</code> if the object is iterable, <code>false</code>
     *         otherwise
     */
@Override public boolean isIterable(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_isIterable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * List the contents of an iterable.
     *
     * Iterable items are returned in the same format as the
     * <code>getFields</code> method.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the iterable contents
     */
@Override public java.lang.String[] getIterable(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_getIterable, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get a specific iterable item as an entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param item the item index from the iterable list
     * @return index to the object in the entry point list
     */
@Override public int getIterableItem(int entryPoint, int[] path, int item) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
_data.writeInt(item);
mRemote.transact(Stub.TRANSACTION_getIterableItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add a <code>String</code> to the entry point list.
     *
     * @param s the string
     * @return index of the <code>String</code> in the entry point list
     */
@Override public int pushString(java.lang.String s) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(s);
mRemote.transact(Stub.TRANSACTION_pushString, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add an integer to the entry point list.
     *
     * @param i the integer
     * @return index of the integer in the entry point list
     */
@Override public int pushInt(int i) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(i);
mRemote.transact(Stub.TRANSACTION_pushInt, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add a boolean to the entry point list.
     *
     * @param b the boolean
     * @return index of the integer in the entry point list
     */
@Override public int pushBoolean(boolean b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((b)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_pushBoolean, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add an arbitrary object to the entry point list.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return index of the object in the entry point list
     */
@Override public int push(int entryPoint, int[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(entryPoint);
_data.writeIntArray(path);
mRemote.transact(Stub.TRANSACTION_push, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Load a new macro;
     *
     * Load a macro from a remote application. The macro must be sent
     * as a loadable dex class implementing the <code>IMacro</code>
     * interface. The string must be base64 encoded.
     * @param macro the loaded macro
     * @return index of the newly created entrypoint
     */
@Override public int loadMacro(java.lang.String name, java.lang.String dex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeString(dex);
mRemote.transact(Stub.TRANSACTION_loadMacro, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getEntryPoints = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_filterEntryPoints = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getFields = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getMethods = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getClasses = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_newInstance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getTypes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getClass = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getMethodName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getMethodParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_invokeMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_invokeMethodByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isIterable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getIterable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getIterableItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_pushString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_pushInt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_pushBoolean = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_push = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_loadMacro = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
/**
     * List registered entry points.
     *
     * @return an array listing existing entry points
     */
public java.lang.String[] getEntryPoints() throws android.os.RemoteException;
/**
     * Filter registered entry points given a compatible type description.
     *
     * An registered entry point is compatible with the type described if :
     *  - the given <code>String</code> is a resolvable type name in the
     *    service context;
     *  - the entry point canonical type may be cast to the described type.
     *
     * @param type the type description
     * @return an <code>int[]</code> array of compatible entry points
     */
public int[] filterEntryPoints(java.lang.String type) throws android.os.RemoteException;
/**
     * List fields available for the referenced object.
     *
     * The field list is returned in the "<type>:<name>" format.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the list of accessible fields
     */
public java.lang.String[] getFields(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * List methods available for the referenced object.
     *
     * The field list is returned in the "<full name>:<name>" format.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the list of accessible methods
     */
public java.lang.String[] getMethods(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * List classes available for the referenced object.
     *
     * The class list is returned in the "<full name>:<name>" format.
     *
     * @param entryPoint the referrence entry point
     * @param path the path from entry point
     * @return the list of accessible classes
     */
public java.lang.String[] getClasses(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Create a new instance of a given type.
     *
     * @param className the target class name
     * @param params parameters to pass to the constructor
     * @return index of the entry point for the new instance
     */
public int newInstance(int entryPoint, int[] path, int[] paramsId) throws android.os.RemoteException;
/**
     * Generate a descriptive value of the path from the entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return a dot-separated list of fields as a <code>String</code>
     */
public java.lang.String getPath(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Describe the type of the referenced object.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the described type as a <code>String</code>
     */
public java.lang.String getType(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Describe the type hierarchy of the referenced object
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the described type hierary as a list of <code>String</code>
     */
public java.lang.String[] getTypes(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Retrieve a Class object corresponding to a class name
     *
     * @param className the class name
     * @return the class as an entrypoint index
     */
public int getClass(java.lang.String className) throws android.os.RemoteException;
/**
     * Get the <code>String</code> value of the referenced object.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the object description as return by <code>toString()</code>
     */
public java.lang.String getValue(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Set an object value.
     *
     * Because the object value cannot be modified directly, only its reference
     * according to the given path is set. Thus, not every reference to the
     * object is modified and the behavior may differ depending on the entry
     * point and path used for reference.
     * For the same reason, entry point value cannot be set.
     *
     * @param entryPoint an <code>int</code> value
     * @param path an <code>int</code> value
     * @param value an <code>int</code> value
     */
public void setValue(int entryPoint, int[] path, int value) throws android.os.RemoteException;
/**
     * Get a method name.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @return the method name
     */
public java.lang.String getMethodName(int entryPoint, int[] path, int method) throws android.os.RemoteException;
/**
     * Get a list of method parameter types.
     *
     * If the parameters list is empty or misformed, then the raw list
     * of parameter types is returned. Otherwise, a typed list of current
     * parameter values is returned.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @param parameters current parameter values
     * @return a list of <code>String</code> description of parameter types
     */
public java.lang.String[] getMethodParams(int entryPoint, int[] path, int method, int[] parameters) throws android.os.RemoteException;
/**
     * Invoke a method given the provided parameters.
     *
     * Parameters must be provided as a list of index from the entry point
     * list. Thus, only entry points may be used as method parameters. The
     * result is returned as an entry point as well. See the <code>push</code>
     * method for creating entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param method the method index from method list
     * @param parameters the parameter list
     * @return index of the method result in the entry point list
     */
public int invokeMethod(int entryPoint, int[] path, int method, int[] parameters) throws android.os.RemoteException;
/**
     * Invoke a method given the provided parameters.
     *
     * Parameters must be provided as a list of index from the entry point
     * list. Thus, only entry points may be used as method parameters. The
     * result is returned as an entry point as well. See the <code>push</code>
     * method for creating entry point.
     *
     * @param entryPoint the reference entry point
     * @param method the method name to invoke
     * @param parameters the parameter list
     * @return index of the method result in the entry point list
     */
public int invokeMethodByName(int entryPoint, int[] path, java.lang.String method, int[] parameters) throws android.os.RemoteException;
/**
     * Check if the referenced object is iterable.
     *
     * Both standard Java arrays and objects implementing the
     * <code>Iterable</code> interface are considered iterable.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return <code>true</code> if the object is iterable, <code>false</code>
     *         otherwise
     */
public boolean isIterable(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * List the contents of an iterable.
     *
     * Iterable items are returned in the same format as the
     * <code>getFields</code> method.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return the iterable contents
     */
public java.lang.String[] getIterable(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Get a specific iterable item as an entry point.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @param item the item index from the iterable list
     * @return index to the object in the entry point list
     */
public int getIterableItem(int entryPoint, int[] path, int item) throws android.os.RemoteException;
/**
     * Add a <code>String</code> to the entry point list.
     *
     * @param s the string
     * @return index of the <code>String</code> in the entry point list
     */
public int pushString(java.lang.String s) throws android.os.RemoteException;
/**
     * Add an integer to the entry point list.
     *
     * @param i the integer
     * @return index of the integer in the entry point list
     */
public int pushInt(int i) throws android.os.RemoteException;
/**
     * Add a boolean to the entry point list.
     *
     * @param b the boolean
     * @return index of the integer in the entry point list
     */
public int pushBoolean(boolean b) throws android.os.RemoteException;
/**
     * Add an arbitrary object to the entry point list.
     *
     * @param entryPoint the reference entry point
     * @param path the path from entry point
     * @return index of the object in the entry point list
     */
public int push(int entryPoint, int[] path) throws android.os.RemoteException;
/**
     * Load a new macro;
     *
     * Load a macro from a remote application. The macro must be sent
     * as a loadable dex class implementing the <code>IMacro</code>
     * interface. The string must be base64 encoded.
     * @param macro the loaded macro
     * @return index of the newly created entrypoint
     */
public int loadMacro(java.lang.String name, java.lang.String dex) throws android.os.RemoteException;
}
