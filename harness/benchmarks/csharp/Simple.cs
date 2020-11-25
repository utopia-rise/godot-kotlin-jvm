using Godot;

public class Simple : Reference
{
    public int benchmark_simple_add()
    {
        var a = 1;
        var b = 2;
        return a + b;
    }

    public int benchmark_avg()
    {
        var size = 10000;
        var total = 0;

        for (var i = 0; i < size; i++)
        {
            total += i;
        }

        return total / size;
    }

    public Vector3 benchmark_vectors()
    {
        var b = new Transform();
        b = b.Rotated(Vector3.Up, Mathf.Deg2Rad(60));
        b = b.Scaled(new Vector3(0.5f, 0.5f, 0.5f));

        var s = new Vector3();

        for (var i = 0; i < 1000; i++)
        {
            var v = new Vector3(i, i, i);
            v = b.Xform(v);
            s += v;
        }

        return s;
    }

    public Vector2 benchmark_vectors2_only()
    {
        var s = new Vector2();
        for (var i = 0; i < 1000; i++)
        {
            var v = new Vector2(i, i);
            s += v;
        }

        return s;
    }

    public Node benchmark_icall()
    {
        var node = new Node();
        node.GetInstanceId();
        return node;
    }

    public Node benchmark_icall_with_loop()
    {
        var node = new Node();
        for (var i = 0; i < 1000; i++)
        {
            var child = new Node();
            node.AddChild(child);
            node.RemoveChild(child);
            child.Free();
        }

        return node;
    }

    public void benchmark_method_call()
    {
    }
}
