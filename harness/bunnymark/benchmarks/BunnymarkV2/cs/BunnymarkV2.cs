using Godot;
using System;
using System.Collections.Generic;

public partial class BunnymarkV2 : Node2D
{
    Vector2 screenSize;

    Texture2D bunnyTexture = (Texture2D)GD.Load("res://images/godot_bunny.png");
    List<Vector2> speeds = new List<Vector2>();
    Random random = new Random();
    int gravity = 500;
    Node2D bunnies = new Node2D();
    Label label = new Label();

    public override void _Ready()
    {
        AddChild(bunnies);
        label.Position = new Vector2(0, 20);
        AddChild(label);
    }

    public override void _Process(float delta)
    {
        screenSize = GetViewportRect().Size;
        label.Text = $"Bunnies: {bunnies.GetChildCount()}";
        
        var bunnyChildren = bunnies.GetChildren();
        for (var i = 0; i < bunnyChildren.Count; i++)
        {
            var bunny = (Sprite2D)bunnyChildren[i];
            var position = bunny.Position;
            var speed = speeds[i];

            position.x += speed.x * delta;
            position.y += speed.y * delta;

            speed.y += gravity * delta;

            if (position.x > screenSize.x)
            {
                speed.x *= -1;
                position.x = screenSize.x;
            }

            if (position.x < 0)
            {
                speed.x *= -1;
                position.x = 0;
            }

            if (position.y > screenSize.y)
            {
                position.y = screenSize.y;
                if (random.NextDouble() > 0.5)
                {
                    speed.y = (random.Next() % 1100 + 50);
                }
                else
                {
                    speed.y *= -0.85f;
                }
            }

            if (position.y < 0)
            {
                speed.y = 0;
                position.y = 0;
            }

            bunny.Position = position;
            speeds[i] = speed;
        }
    }

    public void add_bunny()
    {
        var bunny = new Sprite2D();
        bunny.SetTexture(bunnyTexture);
        bunnies.AddChild(bunny);
        bunny.Position = new Vector2(screenSize.x / 2, screenSize.y / 2);
        speeds.Add(new Vector2(random.Next() % 200 + 50, random.Next() % 200 + 50));
    }

    public void remove_bunny()
    {
        var childCount = bunnies.GetChildCount();
        if (childCount == 0) {
			return;
		}

        var bunny = bunnies.GetChild(childCount - 1);
        speeds.RemoveAt(childCount - 1);
        bunnies.RemoveChild(bunny);
        bunny.QueueFree();
    }

    public void finish()
    {
        EmitSignal("benchmark_finished", bunnies.GetChildCount());
    }
}
