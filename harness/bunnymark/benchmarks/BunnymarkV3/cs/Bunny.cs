using Godot;

// ReSharper disable once CheckNamespace
public class Bunny : Sprite
{
    public Vector2 Speed = Vector2.Zero;

    private readonly int grav = 500;
    private Vector2 screenSize;
    private readonly RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public override void _Ready()
    {
        randomNumberGenerator.Randomize();
    }

    public override void _Process(float delta)
    {
        screenSize = GetViewportRect().Size;
        var pos = Position;
        var sp = Speed;

        pos.x += sp.x * delta;
        pos.y += sp.y * delta;

        sp.y += grav * delta;

        if (pos.x > screenSize.x)
        {
            sp.x *= -1f;
            pos.x = screenSize.x;
        }

        if (pos.x < 0)
        {
            sp.x *= -1f;
            pos.x = 0;
        }

        if (pos.y > screenSize.y)
        {
            pos.y = screenSize.y;
            if (randomNumberGenerator.Randf() > 0.5f)
            {
                sp.y = -(randomNumberGenerator.Randi() % 1100f + 50f);
            }
            else
            {
                sp.y *= -0.85f;
            }
        }

        if (pos.y < 0)
        {
            sp.y = 0f;
            pos.y = 0f;
        }

        Position = pos;
        Speed = sp;
    }
}
