using Godot;
using System;
using System.Collections.Generic;

public partial class BunnymarkV1Sprites : Node2D
{
    private class Pair
    {
        public Sprite2D Sprite2D;
        public Vector2 Vector;
    }

    List<Pair> bunnies = new List<Pair>();
    Vector2 screenSize;

    Texture2D bunnyTexture = (Texture2D)GD.Load("res://images/godot_bunny.png");
    Random random = new Random();
    int gravity = 500;

    public override void _Process(float delta)
    {
        screenSize = GetViewportRect().Size;

        foreach (var bunny in bunnies)
        {
            var position = bunny.Sprite2D.Position;
            var newPosition = bunny.Vector;

            position.x += newPosition.x * delta;
            position.y += newPosition.y * delta;

            newPosition.y += gravity * delta;

            if (position.x > screenSize.x)
            {
                newPosition.x *= -1;
                position.x = screenSize.x;
            }

            if (position.x < 0)
            {
                newPosition.x *= -1;
                position.x = 0;
            }

            if (position.y > screenSize.y)
            {
                position.y = screenSize.y;
                if (random.NextDouble() > 0.5)
                {
                    newPosition.y = (random.Next() % 1100 + 50);
                }
                else
                {
                    newPosition.y *= -0.85f;
                }
            }

            if (position.y < 0)
            {
                newPosition.y = 0;
                position.y = 0;
            }

            bunny.Sprite2D.Position = position;
            bunny.Vector = newPosition;
        }
    }

    public void add_bunny()
    {
        var bunny = new Sprite2D();
        bunny.SetTexture(bunnyTexture);
        AddChild(bunny);
        bunny.Position = new Vector2(screenSize.x / 2, screenSize.y / 2);
        bunnies.Add(new Pair() { Sprite2D = bunny, Vector = new Vector2(random.Next() % 200 + 50, random.Next() % 200 + 50) });
    }

    public void remove_bunny()
    {
        if (bunnies.Count == 0) {
			return;
		}

        var bunny = bunnies[bunnies.Count - 1];
        bunnies.RemoveAt(bunnies.Count - 1);
        RemoveChild(bunny.Sprite2D);
        bunny.Sprite2D.QueueFree();
    }

    public void finish()
    {
        EmitSignal("benchmark_finished", bunnies.Count);
    }
}
