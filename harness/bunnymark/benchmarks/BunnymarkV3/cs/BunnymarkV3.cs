using Godot;

// ReSharper disable once CheckNamespace
public class BunnymarkV3 : Node2D
{
    [Signal]
    // ReSharper disable once InconsistentNaming
    public delegate void benchmark_finished(long bunnyCount);

    private readonly RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private readonly Texture bunnyTexture = ResourceLoader.Load<Texture>("res://images/godot_bunny.png");
    private readonly Label label = new Label();
    private readonly Node2D bunnies = new Node2D();

    private Vector2 screenSize;

    public override void _Ready()
    {
        randomNumberGenerator.Randomize();
        AddChild(bunnies);

        label.SetPosition(new Vector2(0, 20));
        AddChild(label);
    }

    public override void _Process(float delta)
    {
        screenSize = GetViewportRect().Size;
        label.Text = "Bunnies " + bunnies.GetChildCount();
    }

    public void add_bunny()
    {
        var bunny = new Bunny {Texture = bunnyTexture};
        bunnies.AddChild(bunny);
        bunny.Position = new Vector2(screenSize.x / 2, screenSize.y / 2);
        bunny.Speed = new Vector2(randomNumberGenerator.Randi() % 200 + 50, randomNumberGenerator.Randi() % 200 + 50);
    }

    public void remove_bunny()
    {
        var childCount = bunnies.GetChildCount();
        if (childCount != 0)
        {
            var bunny = bunnies.GetChild(childCount - 1);
            bunnies.RemoveChild(bunny);
            bunny.QueueFree();
        }
    }

    // ReSharper disable once InconsistentNaming
    public void finish()
    {
        EmitSignal(nameof(benchmark_finished), bunnies.GetChildCount());
    }
}
