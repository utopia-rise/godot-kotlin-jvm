using Godot;
using System;
using System.Collections.Generic;

public partial class BunnymarkV1DrawTexture : Node2D
{
    private class Pair
    {
        public Vector2 Current;
        public Vector2 Next;
    }

    List<Pair> bunnies = new List<Pair>();
    Vector2 screenSize;
    Texture2D bunnyTexture = (Texture2D)GD.Load("res://images/godot_bunny.png");
    Random random = new Random();
    int gravity = 500;

    public override void _Draw()
    {
        foreach (var bunny in bunnies)
            DrawTexture(bunnyTexture, bunny.Current);
    }
	
    public override void _Process(float delta)
    {
        screenSize = GetViewportRect().Size;

        foreach (var bunny in bunnies)
        {
            var position = bunny.Current;
            var newPosition = bunny.Next;

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
			
            bunny.Current = position;
            bunny.Next = newPosition;
        }

        Update();
    }

    public void add_bunny()
    {
        bunnies.Add(new Pair() { Current = new Vector2(screenSize.x / 2, screenSize.y / 2), Next = new Vector2(random.Next() % 200 + 50, random.Next() % 200 + 50) });
    }

    public void remove_bunny()
    {
        if (bunnies.Count == 0) {
            return;
        }
		
        bunnies.RemoveAt(bunnies.Count - 1);
    }

    public void finish()
    {
        EmitSignal("benchmark_finished", bunnies.Count);
    }
}
