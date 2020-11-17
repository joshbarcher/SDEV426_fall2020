package pattern;

public interface IObserver<T>
{
    void update(T observable, Object... arguments);
}
