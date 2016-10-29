select actor.actor_id, actor.first_name, actor.last_name, count(film_actor.film_id) as NumberOfFilms
from actor
inner join film_actor
on actor.actor_id=film_actor.actor_id
group by actor.actor_id, actor.first_name, actor.last_name
order by NumberOfFilms